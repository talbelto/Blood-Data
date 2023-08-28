public class TestPatient {

    public static void main(String []args){
        Patient TestPatientOne = new Patient(876810,28,"O","+");
        Patient TestPatientTwo = new Patient(56789,32,"A","+");
        Patient TestPatientThree = new Patient(10111213,35,"B","-");
        Patient TestPatientFour = new Patient();
        TestBloodData(TestPatientFour);
        TestPatientFour.setIdNumber(12345);
        TestPatientFour.setAge(36);
        TestBloodData(TestPatientFour);
        TestBloodData(TestPatientTwo);
        TestBloodData(TestPatientThree);
        TestBloodData(TestPatientOne);


    }
    public static void TestBloodData(Patient Test){
        BloodData BDType = Test.getData();

        System.out.println("Test Patient ID Number: " +Test.getIdNumber()+"   Test Patient Age: "+Test.getAge()+ "  Test Patient Blood Type: "+BDType.getBloodType()+BDType.getRhFactor());

    }

}
