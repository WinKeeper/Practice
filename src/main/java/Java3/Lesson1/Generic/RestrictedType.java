package Java3.Lesson1.Generic;

public class RestrictedType {

    public class Stats<T extends Number> {
        private T[] nums;

        public Stats(T... nums) {
            this.nums = nums;
        }

        public double avg() {
            double sum = 0.0;
            for(int i = 0; i < nums.length; i++) {
            // У nums[i] появился метод doubleValue() из класса Number
            // который позволяет любой числовой объект привести к double
                sum += nums[i].doubleValue();
            }
            return sum / nums.length;
        }
    }

    public void StatsAvg() {
        Stats<Integer> intStats = new Stats<Integer>(1, 2, 3, 4, 5);
        System.out.println("Ср. знач. intStats равно " + intStats.avg());
        Stats<Double> doubleStats = new Stats<Double>(1.0, 2.0, 3.0, 4.0, 5.0);
        System.out.println("Ср. знач. doubleStats равно " + doubleStats.avg());
        // Это не скомпилируется, потому что String не является подклассом Number
        // Stats<String> strStats = new Stats<>("1", "2", "3", "4", "5");
        // System.out.println("Ср. знач. strStats равно " + strStats.avg());
    }

}
