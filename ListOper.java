import java.util.ArrayList;

class ListOper{

    ArrayList<Integer> a;

    ListOper(ArrayList<Integer> a){
        this.a = a;
    }

    void remove50() {
        for(int i = a.size() - 1; i >= 0; i--)
            if (a.get(i) > 50)
                a.remove(i);
    }

    void print() {
        for (int i = 0; i < a.size(); i++)
            System.out.print(a.get(i) + " ");
        System.out.println();
    }
}