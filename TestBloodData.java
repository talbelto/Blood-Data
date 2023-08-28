public class TestBloodData {
    public static void main(String []args){
        BloodData TypeOne = new BloodData();
        BloodData TypeTwo = new BloodData("B","+");
        BloodData TypeThree = new BloodData("A","-");
        BloodData TypeFour = new BloodData("AB","-");
        TestBloodData(TypeOne);
        TestBloodData(TypeTwo);
        TestBloodData(TypeThree);
        TestBloodData(TypeFour);


    }

    public static void TestBloodData(BloodData Type ){
        System.out.println("Blood Type Result is: "+Type.getBloodType() + Type.getRhFactor());
    }
}
