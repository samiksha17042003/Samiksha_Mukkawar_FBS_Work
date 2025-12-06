package FunctionOverloading;
class Time {
    int hr;
    int min;
    int sec;

    Time(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
        formatTime();
    }

     void formatTime() {
        int totalSeconds = hr * 3600 + min * 60 + sec;
        sec = totalSeconds % 60;
        int totalMinutes = totalSeconds / 60;
        min = totalMinutes % 60;
        hr = totalMinutes / 60;
    }

    // Overload add method to add two Time objects
        Time add(Time other) {
        int totalSeconds = (this.hr + other.hr) * 3600 + (this.min + other.min) * 60 + (this.sec + other.sec);
        return new Time(0, 0, totalSeconds);
    }

    // Overload add method to add an integer 
    public Time add(int seconds) {
        int totalSeconds = this.hr * 3600 + this.min * 60 + this.sec + seconds;
        return new Time(0, 0, totalSeconds);
    }
    
    // Can also add specific methods for hours/minutes
    public Time addHours(int hours) {
        return new Time(this.hr + hours, this.min, this.sec);
    }

    public Time addMinutes(int minutes) {
        return new Time(this.hr, this.min + minutes, this.sec);
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hr, min, sec);
    }
}
 class TimeDemo {
    public static void main(String[] args) {
        Time t1 = new Time(10,30,45);
        Time t2 = new Time(2,45,20);

        Time sum1 = t1.add(t2);
        System.out.println("Sum of two times: "+ sum1);

        Time sum2 = t1.add(3600);
        System.out.println("Add integer (seconds): " + sum2);
        
        Time sum3 = t1.addMinutes(90);
        System.out.println("Add minutes: " + sum3);
    }
}