import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        String a1 = o1.getAuthor();
        String a2 = o2.getAuthor();

        a1 = a1.replaceAll(" ","");
        a2 = a2.replaceAll(" ","");

        a1 = a1.toUpperCase();
        a2 = a2.toUpperCase();

        for (int i = 0; i < a1.length(); i++) {
            if (i < a2.length()) {
                if (a1.charAt(i) < a2.charAt(i)) {
                    return -1;
                } else if (a1.charAt(i) > a2.charAt(i)) {
                    return 1;
                }
            }
        }

        if (a2.length() > a1.length()) {
            return -1;
        }

        String t1 = o1.getTitle();
        String t2 = o2.getTitle();

        t1 = t1.replaceAll(" ","");
        t2 = t2.replaceAll(" ","");

        t1 = t1.toUpperCase();
        t2 = t2.toUpperCase();

        for (int i = 0; i < t1.length(); i++) {
            if (i < t2.length()) {
                if (t1.charAt(i) < t2.charAt(i)) {
                    return -1;
                } else if (t1.charAt(i) > t2.charAt(i)) {
                    return 1;
                }
            }
        }

        if (t2.length() > t1.length()) {
            return -1;
        }
        
        int y1 = o1.getYear();
        int y2 = o2.getYear();

        if (y1 > y2) {
            return 1;
        } else if (y2 > y1) {
            return -1;
        }

        return 0;
    }

}