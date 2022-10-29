package p1;

import java.util.Collection;
import java.util.Collections;
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
        Collections.sort(p0);

    }
}
