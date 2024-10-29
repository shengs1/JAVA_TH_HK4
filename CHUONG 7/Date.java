public class Date {
    private int year;
    private int month;
    private int day;

    // Constructor với tham so ngày, tháng, năm
    public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    //phương thức thêm ngày
    public void addDays(int days) {
        for (int i = 0; i < days; i++){
            nextDays();
        }
    }
    //phương thức thêm tuần
    public void addWeeks(int weeks){
        addDays(weeks * 7);
    }
    //Phương thức tính Date mới
    public int daysTo(Date other) {
        int daysCount = 0;
        Date temp = new Date(this.year, this.month, this.day);

        while (!temp.equals(other)){
            temp.nextDays();
            daysCount++;
        }
        return daysCount;
    }
    //Trả giá trị ngày
    public int getDay() {
        return day;
    }
    //Trả giá trị tháng
    public int getMonth() {
        return month;
    }
    //Trả giá trị năm
    public int getYear() {
        return year;
    }
    //Tính năm nhuận(trả về true nếu năm nhuận, trả về false nếu ko phải)
    public boolean isLeapYear() {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }
    private void nextDays() {
        day++;
        if (day > daysIsMonth(month,year)) {
            day = 1;
            month++;
            if(month > 12) {
                month = 1;
                year++;
            }
        }
    }
    private int daysIsMonth(int month, int year) {
        switch (month) {
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear() ? 29 : 28;
            default:
                return 31;
        }
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Date date = (Date) obj;
        return year == date.year && month == date.month && day == date.day; 
    }

    //hàm in
    @Override
    public String toString() {
        return String.format("%04d/%02d/%02d", year, month, day);
    }

    public static void main(String[] args) {
        Date date = new Date(2006, 7, 22);

        System.out.println("Ngay ban dau: " + date);

        System.out.println("Ngay: " + date.getDay());
        System.out.println("Thang: " + date.getMonth());
        System.out.println("Year: " + date.getYear());
        System.out.println("Nam nhuan: " + (date.isLeapYear() ? "Co" : "Khong"));

        date.addDays(10);
        System.out.println("Sau khi them 10 ngay: " + date);

        date.addWeeks(2);
        System.out.println("Sau khi them 2 tuan: " + date);

        Date date2 = new Date(2006, 8, 10);
        System.out.println("So ngay giua ngay hien tai va " + date2 + ": " + date.daysTo(date2));
    }
}

