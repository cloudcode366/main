package p1;

import java.util.List;

public class MyCala implements ICala {
    @Override
    public int f1(List<Cala> p0) {
        int cout = 0;

        int n = p0.size();
        for (int i = 0; i < n; i++) {
            Cala lst1 = p0.get(i);
            String str1 = lst1.getOwner();
            if (str1.length() > 2) {
                if (str1.charAt(1) >= 48 && str1.charAt(1) <= 57) {
                    cout++;
                }
            }
        }
        return cout;
    }

    @Override
    public void f2(List<Cala> p0) {
        int tam = 0;
        int n = p0.size();
        for (int i = 0; i < n; i++) {
            Cala lst1 = p0.get(i);
            int price = lst1.getPrice();
            if (price > tam) {
                tam = price;
            }
        }
        // System.out.print(tam);
        int cout = 0;
        for (int i = 0; i < n; i++) {
            // System.out.println(i+",");

            Cala lst1 = p0.get(i);
            int price = lst1.getPrice();
            // System.out.print(price);
            if (price == tam) {
                cout++;
                // System.out.print(cout);
                if (cout == 2) {
                    // System.out.print(i);
                    p0.remove(i);
                    break;
                }
            }
        }

    }

    @Override
    public void f3(List<Cala> p0) {
        int n = p0.size();
            for (int i = 0; i < n - 1; i++) {
                // System.out.print(0);
                Cala lst1 = p0.get(i);
                String str1 = lst1.getOwner();

                for (int j = i+1; j < n; j++) {
                    lst1 = p0.get(i);
                    str1 = lst1.getOwner();
                    // System.out.print(1);
                    Cala lst2 = p0.get(j);
                    String str2 = lst2.getOwner();

                    if (str1.charAt(1) > str2.charAt(1)) {
                        Cala tam = p0.get(i);
                        p0.remove(i);
                        
                        p0.add(i, p0.get(j-1));
                        p0.remove(j);
                        
                        p0.add(j, tam);
                        
                    }
                }

            }

    }
}
