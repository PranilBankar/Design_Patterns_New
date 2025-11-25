// Interpreter DP- Expression - 10+5-2
// Abstract Interface
interface Expression {
int interpret();
}
// Terminal Expression 
class TermExp implements Expression {
int num;
public TermExp(int num){
this.num=num;
}
@Override 
public int interpret(){
return num;
}
}
// Non Terminal Expression 
class AddExp implements Expression {
Expression left;
Expression right;
public AddExp(Expression left, Expression right){
this.left=left;
this.right=right;
}
@Override 
public int interpret(){
return left.interpret()+right.interpret();
}
}
class SubExp implements Expression {
Expression left;
Expression right;
public SubExp(Expression left, Expression right){
this.left=left;
this.right=right;
}
@Override 
public int interpret(){
return left.interpret()-right.interpret();
}
}
//client 
public class Main{
public static void main(String[] args) {
Expression ten = new TermExp(10);
Expression five = new TermExp(5);
Expression two = new TermExp(2);
Expression add = new AddExp(ten,five);
Expression sub = new SubExp(add,two);
System.err.println(sub.interpret());
}
}

