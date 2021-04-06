import java.util.Scanner;
public class doiSoThanhChu {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                int number;
                do {
                    System.out.println("Nhập số cần đọc:");
                    number = scanner.nextInt();
                    if(number < 10 && number > 0){
                        switch (number) {
                            case 1: {
                                System.out.println("Một");
                                break;
                            }
                            case 2: {
                                System.out.println("Hai");
                                break;
                            }
                            case 3: {
                                System.out.println("Ba");
                                break;
                            }
                            case 4: {
                                System.out.println("Bốn");
                                break;
                            }
                            case 5: {
                                System.out.println("Năm");
                                break;
                            }
                            case 6: {
                                System.out.println("Sáu");
                                break;
                            }
                            case 7: {
                                System.out.println("Bảy");
                                break;
                            }
                            case 8: {
                                System.out.println("Tám");
                                break;
                            }
                            case 9: {
                                System.out.println("Chín");
                                break;
                            }
                        }
                    }else {
                        int hangChuc = number / 10;
                        int donVi = number % 10;
                        String numberToString = "";
                        switch (hangChuc) {
                            case 1: {
                                numberToString += "Mười ";
                                break;
                            }
                            case 2: {
                                numberToString += "Hai Mươi ";
                                break;
                            }
                            case 3: {
                                numberToString += "Ba Mươi ";
                                break;
                            }
                            case 4: {
                                numberToString += "Bốn Mươi ";
                                break;
                            }
                            case 5: {
                                numberToString += "Năm Mươi ";
                                break;
                            }
                            case 6: {
                                numberToString += "Sáu Mươi ";
                                break;
                            }
                            case 7: {
                                numberToString += "Bảy Mươi ";
                                break;
                            }
                            case 8: {
                                numberToString += "Tám Mươi ";
                                break;
                            }
                            case 9: {
                                numberToString += "Chín Mươi ";
                                break;
                            }
                        }
                        switch (donVi) {
                            case 1: {
                                numberToString += "Một";
                                break;
                            }
                            case 2: {
                                numberToString += "Hai";
                                break;
                            }
                            case 3: {
                                numberToString += "Ba";
                                break;
                            }
                            case 4: {
                                numberToString += "Bốn";
                                break;
                            }
                            case 5: {
                                numberToString += "Năm";
                                break;
                            }
                            case 6: {
                                numberToString += "Sáu";
                                break;
                            }
                            case 7: {
                                numberToString += "Bảy";
                                break;
                            }
                            case 8: {
                                numberToString += "Tám";
                                break;
                            }
                            case 9: {
                                numberToString += "Chín";
                                break;
                            }
                        }
                        System.out.println(numberToString);
                    }
                }while (number > 0 && number <= 99);
            }
        }

