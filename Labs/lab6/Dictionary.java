public class Dictionary implements Map<String, Integer> {

    private final static int INITIAL_CAPACITY = 10;
    private final static int INCREMENT = 5;
    private int count;

    private Pair[] elems;

    public int getCount() {
      return count;
    }

    public int getCapacity() {
      return elems.length;
    }

    public Dictionary() {
        elems = new Pair[INITIAL_CAPACITY];
        count = 0;
    }

    @Override
    public void put(String key, Integer value) {
        
        Pair temp = new Pair(key, value);

        elems[count] = temp;

        if (count == elems.length) {
            increaseCapacity();
        }

    }

    private void increaseCapacity() {
        Pair[] temp = new Pair[elems.length + INCREMENT];

        for (int i = 0; i < elems.length; i++) {
            temp[i] = elems[i];
        }
    }

    @Override
    public boolean contains(String key) {
        for (int i = count - 1; i >= 0; i--) {
            if(elems[i].getKey().equals(key)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Integer get(String key) {
        if (contains(key)) {
            for (Pair pair : elems) {
                if(pair.getKey().equals(key)) {
                    return pair.getValue();
                }
            }
        }

        return null;
    }

    @Override
    public void replace(String key, Integer value) {
        if (!contains(key)) {
            put(key, value);
        } else {
            for (int i = 0; i < count; i++) {
                if (elems[i].getKey().equals(key)) {
                    Pair temp = new Pair(key, value);

                    elems[i] = temp;

                    return;
                }
            }
        }
    }

    @Override
    public Integer remove(String key) {
        if(contains(key)) {
            Integer returnVal = get(key);

            Pair[] temp = new Pair[elems.length];
            
            int j = 0;

           for (int i = 0; i < count; i++) {
                if (!elems[i].getKey().equals(key)) {
                    temp[j] = elems[i];
                }
            }

            elems = temp;

            return returnVal;
        }
        return null;
    }

    @Override
    public String toString() {
      String res;
      res = "Dictionary: {elems = [";
      for (int i = count-1; i >= 0 ; i--) {
          res += elems[i];
          if(i > 0) {
              res += ", ";
          }
      }
      return res +"]}";
    }

}