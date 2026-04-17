public class MySet {
    private int[] myElements;
    private int myElementCount;

    public MySet(int count) {
        myElements = new int[count];
        myElementCount = count;
        for (int x = 0; x < count; x++) {
            myElements[x] = x * 10;
        }
        System.out.println(this);
        boolean isIn = contains(10);
        System.out.println(isIn);
        isIn = contains(132);
        System.out.println(isIn);

        boolean removing = remove(132);
        System.out.println(removing);
        System.out.println(this);
        

        boolean remove = remove(10);
        System.out.println(removing);
        System.out.println(this);
    }

    public boolean contains(int x) {
        return containsHelper(x, 0);

    }

    public boolean containsHelper(int value, int index) {
        if (index == myElementCount)
            return false;
        else if (value == myElements[index])
            return true;
        return containsHelper(value, index + 1);
    }

    public boolean remove(int x) {
        return removeHelper(x, 0);

    }

    public boolean removeHelper(int value, int index) {
        if (index == myElementCount)
            return false;
        else if (value == myElements[index])
            for (int d = index; d < myElementCount - 1; d++) {
                myElements[d] = myElements[d + 1];
                myElementCount--;
                return true;
            }

        return containsHelper(value, index + 1);
    }

    public String toString(){
       String m = " ";
       for (int d : myElements)
        m+= d + " ";
        return m;
       
    }

    public static void main(String[] args) {
        new MySet(10);
    }
}