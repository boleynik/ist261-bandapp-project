import models.Uniform;

public class TestHarness {

    public TestHarness(){

    }
    public void testUniform(){
        System.out.println("Testing the models.Uniform class: ");
        Uniform uniform1 = new Uniform(1, true, true, true,
                true, true,true,true);
        if (uniform1 != null){
            System.out.println(uniform1.isHatdoesPass());
            System.out.println(uniform1.isJacketdoesPass());
            System.out.println(uniform1.isGlovesdoesPass());
            System.out.println(uniform1.isPantsdoesPass());
            System.out.println(uniform1.isSpatsdoesPass());
            System.out.println(uniform1.isShoesdoesPass());
            System.out.println(uniform1.isGroomingdoesPass());
        }else {
            System.out.println("There was an error creating the class");
        }
        uniform1.setHatdoesPass(false);
        uniform1.setJacketdoesPass(false);
        uniform1.setGlovesdoesPass(false);
        uniform1.setPantsdoesPass(false);
        uniform1.setSpatsdoesPass(false);
        uniform1.setShoesdoesPass(false);
        uniform1.setGroomingdoesPass(false);
        System.out.println(uniform1.toString());
    }
}
