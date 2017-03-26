
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestLinkedList {

    /**
     * Main method - DO NOT CHANGE THIS CODE!!!!
     */
    static long wordsFound = 0;
    static long wordsNotFound = 0;
    static long compsFound = 0;
    static long compsNotFound = 0;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("random_dictionary.txt"));

        // Create a list for strings
        MyLinkedList<String> a = new MyLinkedList<String>();
        MyLinkedList<String> b = new MyLinkedList<String>();
        MyLinkedList<String> c = new MyLinkedList<String>();
        MyLinkedList<String> d = new MyLinkedList<String>();
        MyLinkedList<String> e = new MyLinkedList<String>();
        MyLinkedList<String> f = new MyLinkedList<String>();
        MyLinkedList<String> g = new MyLinkedList<String>();
        MyLinkedList<String> h = new MyLinkedList<String>();
        MyLinkedList<String> i = new MyLinkedList<String>();
        MyLinkedList<String> j = new MyLinkedList<String>();
        MyLinkedList<String> k = new MyLinkedList<String>();
        MyLinkedList<String> l = new MyLinkedList<String>();
        MyLinkedList<String> m = new MyLinkedList<String>();
        MyLinkedList<String> n = new MyLinkedList<String>();
        MyLinkedList<String> o = new MyLinkedList<String>();
        MyLinkedList<String> p = new MyLinkedList<String>();
        MyLinkedList<String> q = new MyLinkedList<String>();
        MyLinkedList<String> r = new MyLinkedList<String>();
        MyLinkedList<String> s = new MyLinkedList<String>();
        MyLinkedList<String> t = new MyLinkedList<String>();
        MyLinkedList<String> u = new MyLinkedList<String>();
        MyLinkedList<String> v = new MyLinkedList<String>();
        MyLinkedList<String> w = new MyLinkedList<String>();
        MyLinkedList<String> x = new MyLinkedList<String>();
        MyLinkedList<String> y = new MyLinkedList<String>();
        MyLinkedList<String> z = new MyLinkedList<String>();

        while (in.hasNext()) {
            String line = in.next();
            line = line.replaceAll("[^\\w\\s\\ ]", " ").toLowerCase();
            line = line.replaceAll(" ", "");
            if (line.charAt(0) == 'a') {
                a.add(line);
            } else if (line.charAt(0) == 'b') {
                b.add(line);
            } else if (line.charAt(0) == 'c') {
                c.add(line);
            } else if (line.charAt(0) == 'd') {
                d.add(line);
            } else if (line.charAt(0) == 'e') {
                e.add(line);
            } else if (line.charAt(0) == 'f') {
                f.add(line);
            } else if (line.charAt(0) == 'g') {
                g.add(line);
            } else if (line.charAt(0) == 'h') {
                h.add(line);
            } else if (line.charAt(0) == 'i') {
                i.add(line);
            } else if (line.charAt(0) == 'j') {
                j.add(line);
            } else if (line.charAt(0) == 'k') {
                k.add(line);
            } else if (line.charAt(0) == 'l') {
                l.add(line);
            } else if (line.charAt(0) == 'm') {
                m.add(line);
            } else if (line.charAt(0) == 'n') {
                n.add(line);
            } else if (line.charAt(0) == 'o') {
                o.add(line);
            } else if (line.charAt(0) == 'p') {
                p.add(line);
            } else if (line.charAt(0) == 'q') {
                q.add(line);
            } else if (line.charAt(0) == 'r') {
                r.add(line);
            } else if (line.charAt(0) == 's') {
                s.add(line);
            } else if (line.charAt(0) == 't') {
                t.add(line);
            } else if (line.charAt(0) == 'u') {
                u.add(line);
            } else if (line.charAt(0) == 'v') {
                v.add(line);
            } else if (line.charAt(0) == 'w') {
                w.add(line);
            } else if (line.charAt(0) == 'x') {
                x.add(line);
            } else if (line.charAt(0) == 'y') {
                y.add(line);
            } else if (line.charAt(0) == 'z') {
                z.add(line);
            }

        }
        in.close();
        Scanner oliver = new Scanner(new File("oliver.txt"));
        while (oliver.hasNext()) {
            String line = oliver.next();
            line = line.replaceAll("[^\\w\\s\\ ]", " ").toLowerCase();
            line = line.replaceAll(" ", "");
            if (line.length() > 0 && line.charAt(0) == 'a') {
                System.out.println("A contains " + line + "? " + contains(a, line));
            } else if (line.length() > 0 && line.charAt(0) == 'b') {
                System.out.println("B contains " + line + "? " + contains(b, line));
            } else if (line.length() > 0 && line.charAt(0) == 'c') {
                System.out.println("C contains " + line + "? " + contains(c, line));
            } else if (line.length() > 0 && line.charAt(0) == 'd') {
                System.out.println("D contains " + line + "? " + contains(d, line));
            } else if (line.length() > 0 && line.charAt(0) == 'e') {
                System.out.println("E contains " + line + "? " + contains(e, line));
            } else if (line.length() > 0 && line.charAt(0) == 'f') {
                System.out.println("F contains " + line + "? " + contains(f, line));
            } else if (line.length() > 0 && line.charAt(0) == 'g') {
                System.out.println("G contains " + line + "? " + contains(g, line));
            } else if (line.length() > 0 && line.charAt(0) == 'h') {
                System.out.println("H contains " + line + "? " + contains(h, line));
            } else if (line.length() > 0 && line.charAt(0) == 'i') {
                System.out.println("I contains " + line + "? " + contains(i, line));
            } else if (line.length() > 0 && line.charAt(0) == 'j') {
                System.out.println("J contains " + line + "? " + contains(j, line));
            } else if (line.length() > 0 && line.charAt(0) == 'k') {
                System.out.println("K contains " + line + "? " + contains(k, line));
            } else if (line.length() > 0 && line.charAt(0) == 'l') {
                System.out.println("L contains " + line + "? " + contains(l, line));
            } else if (line.length() > 0 && line.charAt(0) == 'm') {
                System.out.println("M contains " + line + "? " + contains(m, line));
            } else if (line.length() > 0 && line.charAt(0) == 'n') {
                System.out.println("N contains " + line + "? " + contains(n, line));
            } else if (line.length() > 0 && line.charAt(0) == 'o') {
                System.out.println("O contains " + line + "? " + contains(o, line));
            } else if (line.length() > 0 && line.charAt(0) == 'p') {
                System.out.println("P contains " + line + "? " + contains(p, line));
            } else if (line.length() > 0 && line.charAt(0) == 'q') {
                System.out.println("Q contains " + line + "? " + contains(q, line));
            } else if (line.length() > 0 && line.charAt(0) == 'r') {
                System.out.println("R contains " + line + "? " + contains(r, line));
            } else if (line.length() > 0 && line.charAt(0) == 's') {
                System.out.println("S contains " + line + "? " + contains(s, line));
            } else if (line.length() > 0 && line.charAt(0) == 't') {
                System.out.println("T contains " + line + "? " + contains(t, line));
            } else if (line.length() > 0 && line.charAt(0) == 'u') {
                System.out.println("U contains " + line + "? " + contains(u, line));
            } else if (line.length() > 0 && line.charAt(0) == 'v') {
                System.out.println("V contains " + line + "? " + contains(v, line));
            } else if (line.length() > 0 && line.charAt(0) == 'w') {
                System.out.println("W contains " + line + "? " + contains(w, line));
            } else if (line.length() > 0 && line.charAt(0) == 'x') {
                System.out.println("X contains " + line + "? " + contains(x, line));
            } else if (line.length() > 0 && line.charAt(0) == 'y') {
                System.out.println("Y contains " + line + "? " + contains(y, line));
            } else if (line.length() > 0 && line.charAt(0) == 'z') {
                System.out.println("Z contains " + line + "? " + contains(z, line));
            }
        }
        oliver.close();
        System.out.println("CompsFound: " + compsFound);
        System.out.println("CompsNotFound: " + compsNotFound);
        System.out.println("WordsFound: " + wordsFound);
        System.out.println("WordsNotFound: " + wordsNotFound);
        System.out.println("AvgCompsFound: " + compsFound/wordsFound);
        System.out.println("AvgCompsNotFound: " + compsNotFound/wordsNotFound);
    }

    public static boolean contains(MyLinkedList<String> list, String s) {
        long comps = 0;
        for (int i = 0; i < list.size; i++) {
            if (list.get(i).equals(s)) {
                comps++;
                wordsFound++;
                compsFound += comps;
                return true;
            } else {
                comps++;
            }
        }
        compsNotFound += comps;
        wordsNotFound++;
        return false;
    }
}
