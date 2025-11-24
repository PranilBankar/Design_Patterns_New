// Step 1: Iterator interface
interface Iterator {
    boolean hasNext();
    Object next();
}

// Step 2: Aggregate interface
interface Container {
    Iterator getIterator();
}

// Step 3: ConcreteAggregate (Collection)
class NameRepository implements Container {
    public String names[] = {"John", "David", "Lisa", "Karan"};
    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    // Step 4: ConcreteIterator
    private class NameIterator implements Iterator {
        int index;
        @Override
        public boolean hasNext() {
            return index < names.length;
        }
        @Override
        public Object next() {
            if(this.hasNext())
                return names[index++];
            return null;
        }
    }
}

// Step 5: Client code
public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository repo = new NameRepository();
        
        for(Iterator iter = repo.getIterator(); iter.hasNext();) {
            String name = (String) iter.next();
            System.out.println("Name: " + name);
        }
    }
}
