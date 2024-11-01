# JAVA_TH_HK4
lệnh để lấy file bin
javac -d bin BTVN/*.java "Chuong1"/*.java "Chuong2"/*.java "Chuong3"/*.java "Chuong4"/*.java

Chương 2: 
Cách dùng for để in hình: 
1) in khoảng trắng: for(j = 1; j < (i - 1); j++)
2) in ký tự: for(j = 1; j < (9 - 2 * j); j++) // (8 - 2 * i) tính bằng ((số ký tự cần in +2 ) -2 * j);

vd 1:           vd2:
    *******              *
     *****              ***
      ***              *****
       *              *******
giải:
public static void vehinh1() {                          
        for(int i = 1; i <= 4; i++){                   
            for(int j = 1; j <= (i - 1); j++){   // in khoảng trắng        
                System.out.print(" ");                 
            }                                         
            for(int j = 1; j <= (9 - 2 * i); j++){    // in ký tự
                System.out.print("*");               
            }                                        
            System.out.println();                            
        }                                                     
    }    
                                       
public static void vehinh2() {            
        for(int i = 4; i >= 1; i--){      
            for(int j = 1; j <= (i - 1); j++){   
                System.out.print(" ");   
            }    
            for(int j = 1; j <= (9 - 2 * i); j++){  
                System.out.print("*");  
            }
            System.out.println();        
        }                                                           
    }      
                                                         


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