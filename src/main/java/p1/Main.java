package p1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class Main
{
    public static void dispList(final List<Cala> t) {
        for (final Cala x : t) {
            System.out.printf("(%s,%d) ", x.getOwner(), x.getPrice());
        }
        System.out.printf("\r\n", new Object[0]);
    }
    
    public static void addToList(final List<Cala> t, final String[] a, final int[] b) {
        for (int n = a.length, i = 0; i < n; ++i) {
            t.add(new Cala(a[i], b[i]));
        }
    }
    
    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        final List<Cala> t = new ArrayList<Cala>();
        final List<Cala> h = new ArrayList<Cala>();
        final String[] c1 = { "A", "D", "C", "B", "E", "F", "G", "H" };
        final String[] c2 = { "H", "G", "F", "E", "D", "C", "B", "A" };
        final int[] d1 = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        final int[] d2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        final String[] a1 = { "A1B", "BC2", "CT", "D3X", "2E1", "FY4" };
        final int[] b1 = { 5, 4, 3, 4, 5, 2 };
        final String[] a2 = { "A", "C", "B", "D", "E", "F" };
        final int[] b2 = { 4, 3, 7, 3, 7, 5 };
        final String[] a3 = { "A8", "B1", "C7", "D2", "E6", "F3" };
        final int[] b3 = { 1, 2, 3, 4, 5, 6 };
        System.out.print("Add how many elements: ");
        final int n = sc.nextInt();
        sc.nextLine();
        String xOwner = "";
        int xPrice = 0;
        for (int i = 0; i < n; ++i) {
            System.out.print("Enter owner: ");
            xOwner = sc.nextLine();
            System.out.print("Enter price: ");
            xPrice = sc.nextInt();
            sc.nextLine();
            h.add(new Cala(xOwner, xPrice));
            t.add(new Cala(xOwner, xPrice));
        }
        System.out.print("Enter TC(1-f1;2-f2;3-f3): ");
        final int tc = sc.nextInt();
        sc.nextLine();
        final ICala u = (ICala)new MyCala();
        switch (tc) {
            case 1: {
                addToList(t, a1, b1);
                System.out.println("The list before running f1:");
                dispList(t);
                break;
            }
            case 2: {
                addToList(t, a2, b2);
                System.out.println("The list before running f2:");
                dispList(t);
                break;
            }
            case 3: {
                addToList(t, a3, b3);
                System.out.println("The list before running f3:");
                dispList(t);
                break;
            }
        }
        System.out.printf("OUTPUT:\r\n", new Object[0]);
        switch (tc) {
            case 1: {
                final int count = u.f1((List)t);
                System.out.printf("%d\r\n", count);
                break;
            }
            case 2: {
                u.f2((List)t);
                dispList(t);
                break;
            }
            case 3: {
                u.f3((List)t);
                dispList(t);
                break;
            }
        }
        System.out.println();
    }
}
