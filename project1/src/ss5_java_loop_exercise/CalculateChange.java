package ss5_java_loop_exercise;

import java.util.Scanner;

/**
 * Tính tiền thối lại
 */
public class CalculateChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá tiền món đồ: ");
        int giaMonDo = scanner.nextInt();
        System.out.print("Nhập số tiền khách hàng trả: ");
        int tienKhachHangTra = scanner.nextInt();

        int tienThoiLai = tienKhachHangTra - giaMonDo;
        int manhGiaTien;

        for (int i = 2; i >= 0; i--) {
            int heSo = (int) Math.pow(10, i);

            manhGiaTien = 5000 * heSo;
            if (tienThoiLai >= manhGiaTien) {
                System.out.printf("%d tờ %d\n", tienThoiLai / manhGiaTien, manhGiaTien);
                tienThoiLai %= manhGiaTien;
            }

            manhGiaTien = 2000 * heSo;
            if (tienThoiLai >= manhGiaTien) {
                System.out.printf("%d tờ %d\n", tienThoiLai / manhGiaTien, manhGiaTien);
                tienThoiLai %= manhGiaTien;
            }


            manhGiaTien = 1000 * heSo;
            if (tienThoiLai >= manhGiaTien) {
                System.out.printf("%d tờ %d\n", tienThoiLai / manhGiaTien, manhGiaTien);
                tienThoiLai %= manhGiaTien;
            }
        }
        System.out.println("Số tiền còn lại: " + tienThoiLai);
    }
}
