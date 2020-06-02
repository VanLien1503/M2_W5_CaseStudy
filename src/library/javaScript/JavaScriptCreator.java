package library.javaScript;

import library.java.JavaLibrary;
import tools.FileReaderAndWriter;

import java.util.ArrayList;

public class JavaScriptCreator {
    public static void main(String[] args) {
        ArrayList<JavaScriptLibrary> javaScriptLibraries = new ArrayList<>();
        String folderPath = "D:\\Downloads\\Codegym\\Slide\\Module1\\";
        javaScriptLibraries.add(new JavaScriptLibrary("1", "Pseudo Code & Flowchart", "2Mb", folderPath + "Slide01-PseudoCodeFlowchart.pdf", "Nhập môn lập trình căn bản"));
        javaScriptLibraries.add(new JavaScriptLibrary("2", "Git & HTML", "2Mb", folderPath + "Slide02-GitHTML.pdf", "Nhập môn lập trình căn bản"));
        javaScriptLibraries.add(new JavaScriptLibrary("3", "HTML Form & Table", "2Mb", folderPath + "Slide03-HTMLFormTable.pdf", "Nhập môn lập trình căn bản"));
        javaScriptLibraries.add(new JavaScriptLibrary("4", "JavaScript Overview", "2Mb", folderPath + "Slide04-JavaScriptOverview.pdf", "Nhập môn lập trình căn bản"));
        javaScriptLibraries.add(new JavaScriptLibrary("5", "Variable and Data Types", "2Mb", folderPath + "Slide05-VariableandDataTypes.pdf", "Nhập môn lập trình căn bản"));
        javaScriptLibraries.add(new JavaScriptLibrary("6", "ConditionalStatements", "2Mb", folderPath + "Slide_06_ConditionalStatements.pdf", "Nhập môn lập trình căn bản"));
        javaScriptLibraries.add(new JavaScriptLibrary("7","LoopStatements","2Mb",folderPath + "Slide_07_LoopStatements.pdf","Nhập môn lập trình căn bản"));
        javaScriptLibraries.add(new JavaScriptLibrary("8","Arrays","2Mb",folderPath + "Slide_08_Arrays.pdf","Nhập môn lập trình căn bản"));
        javaScriptLibraries.add(new JavaScriptLibrary("9","Function","2Mb",folderPath + "Slide_09_Function.pdf","Nhập môn lập trình căn bản"));
        javaScriptLibraries.add(new JavaScriptLibrary("10","Introduction_to_OOP","2Mb",folderPath + "Slide_10_Introduction_to_OOP.pdf","Nhập môn lập trình căn bản"));
        javaScriptLibraries.add(new JavaScriptLibrary("11","Objects_and_Classes","2Mb",folderPath + "Slide_11_Objects_and_Classes.pdf","Nhập môn lập trình căn bản"));
        FileReaderAndWriter<JavaScriptLibrary> fileReaderAndWriter = new FileReaderAndWriter<>();
        fileReaderAndWriter.writeToFile(javaScriptLibraries, "/src/library/javaScript/JavaScriptLibrary.txt");

        ArrayList<JavaLibrary> javaLibraries=new ArrayList<>();
        javaLibraries.add(new JavaLibrary("1","JavaOverview","2Mb",folderPath + "Slide_1_2_3_JavaOverview.pdf","Giớ thiệu Về Java"));
        javaLibraries.add(new JavaLibrary("2","OOP","2Mb",folderPath + "Slide_4_OOP.pdf","Kế Thừa Trong Java"));
        javaLibraries.add(new JavaLibrary("3","AccessModifier","2Mb",folderPath + "Slide_5_AccessModifier.pdf","Mức Độ Truy Cập Trong Java"));
        javaLibraries.add(new JavaLibrary("4","Inheritance","2Mb",folderPath + "Slide_6_Inheritance.pdf","Inheritance"));
        javaLibraries.add(new JavaLibrary("5","Interface_and_Abstract_class","2Mb",folderPath + "Slide_7_Interface_and_Abstract_class.pdf","Lớp Abstract và Lớp interface trong Java"));
        javaLibraries.add(new JavaLibrary("6","Clean_Code","2Mb",folderPath + "Slide_8_Clean_Code.pdf","Làm Sạch Mã Nguồn"));
        javaLibraries.add(new JavaLibrary("7","Test_First_TDD","2Mb",folderPath + "Slide_9_Test_First_TDD.pdf","Kiểm Thử Giúp trương trình ít rủi do"));
        javaLibraries.add(new JavaLibrary("8","Danh_Sach","2Mb",folderPath + "Slide_10_DSA_Danh_Sach.pdf","ArrayList_LinkedList"));
        javaLibraries.add(new JavaLibrary("9","Stack_Queue","2Mb",folderPath + "Slide_11_DSA_Stack_Queue.pdf","Stack_Queue"));
        javaLibraries.add(new JavaLibrary("10","Map_Tree","2Mb",folderPath + "Slide_12_Map_Tree.pdf","Lưu trữ Giá trị trên Key_value "));
        javaLibraries.add(new JavaLibrary("11","Searching_Algorithms","2Mb",folderPath + "Slide_13_Searching_Algorithms.pdf","Thuật Toán Tìm Kiếm nhị Phân Và Tuần Tự"));
        javaLibraries.add(new JavaLibrary("12","Sorting_Algorithms","2Mb",folderPath + "Slide_14_Sorting_Algorithms.pdf","Thuật Toán Sắp Xếp: Chèn+Chọn+Nổi Bọt"));
        javaLibraries.add(new JavaLibrary("13","Debug","2Mb",folderPath + "Slide_15_Debug.pdf","Kiểm Tra Lỗi"));
        javaLibraries.add(new JavaLibrary("14","Exception_Handling","2Mb",folderPath + "Slide_15_Exception_Handling.pdf","Xử Lý Ngoại Lệ trong Java"));
        javaLibraries.add(new JavaLibrary("15","IO_Text_File","2Mb",folderPath + "Slide_16_IO_Text_File.pdf","Giới Thiệu Java.IO"));
        javaLibraries.add(new JavaLibrary("16","Binary_File_and_Serialization","2Mb",folderPath + "Slide_17_Binary_File_and_Serialization.pdf","file Nhi Phân và  cơ chế Serialization "));

//        FileReaderAndWriter<JavaLibrary> fileReaderAndWriterJava = new FileReaderAndWriter<>();
//        fileReaderAndWriter.writeToFile(javaScriptLibraries, "/src/library/javaScript/JavaScriptLibrary.txt");

    }
}
