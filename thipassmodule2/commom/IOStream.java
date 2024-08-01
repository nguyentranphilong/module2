package thipassmodule2.commom;

import thipassmodule2.model.BenhanNor;
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class IOStream {
    private static final String PATH = "src/CodeGymMaganement/data/benhnhanNor.csv";
    public static List<BenhanNor> convertToListTeacher() {
        List<BenhanNor> list = new ArrayList<>();
        try (
                FileReader fileReader = new FileReader(PATH);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
        ) {
            String temp;
            String [] arrData;
            while ((temp = bufferedReader.readLine()) != null) {
                arrData = temp.split(",");
                list.add(new BenhanNor(Integer.parseInt(arrData[0]),arrData[1], arrData[2],
                        LocalDate.parse(arrData[3]), LocalDate.parse(arrData[4]), arrData[5], Integer.parseInt(arrData[6]) ));            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }
    public static void saveTeacherToFile( BenhanNor teacher){
        try(
                FileWriter fileWriter = new FileWriter(PATH, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                ) {
            bufferedWriter.write(teacher.convertToLine());
            bufferedWriter.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void saveListTeacherToFile(List<BenhanNor> teachers){
        try(
                FileWriter fileWriter = new FileWriter(PATH);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                ) {
            for (BenhanNor t : teachers) {
                bufferedWriter.write(t.convertToLine());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


