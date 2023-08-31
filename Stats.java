//use a wildCard
class WildCard<T extends Number> {
    T[] nums;

    WildCard(T[] obj) {
        nums = obj;
    }

    double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum / nums.length;
    }

    boolean sameAvg(WildCard<?> ob) {
        if (average() == ob.average()) {
            return true;
        }
        return false;
    }
}

class Stats {
    public static void main(String[] args) {
        Integer inums[] = { 1, 2, 3, 4, 5 };
        Double dnum[] = { 1.0, 2.0, 3.0, 4.0, 5.0 };
        WildCard<Integer> iob = new WildCard<Integer>(inums);
        WildCard<Double> dob = new WildCard<Double>(dnum);

        if (iob.sameAvg(dob)) {
            System.out.println("Averages are Same");
        } else {
            System.out.println("Averages are Differ");
        }
    }
}