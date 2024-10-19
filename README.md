# JAVA_TH_HK4
lệnh để lấy file bin
javac -d bin BTVN/*.java "Chuong1"/*.java "Chuong2"/*.java "Chuong3"/*.java "Chuong4"/*.java





Chương 4:
Cách dùng printf(format,args)
    format:
    "%d" in số nguyên
    "%f" in số thực
    "%s" in số chuỗi
    "%c" in ký tự
    "%b" in giá trị bootlean

    cách chỉnh định dạng:
    1. Chỉnh độ rộng cho ký tự
    vd: ("%2d",2) nếu để ở format là 2 sẽ luôn đảm bảo độ động ký tự là 2 nên sẽ có 1 khoảng cách ở trước 
    - ngược lại muốn căn trái dùng -

    2. Với số thực(float,double)
    -Có thể chỉ định lấy bao nhiêu số sau dấu phẩy
    vd: ("%.3f%n", 1.234567) khi để .3 số ký tự lấy sau dấu phẩy là 3. kq = 1.234

    3. in ký tự % vd: ("75%%")