public class Action {
    Hogwarts hogwarts=new Hogwarts();
    public void printSlytherinStudents() {
        System.out.println("SLYTHERIN'S STUDENTS: ");
        for (int i = 0; i <hogwarts.sStudents.length; i++) {
            System.out.println(hogwarts.sStudents[i].getName()+ " (Хитрость: "+hogwarts.sStudents[i].getCunning()
                            +"\\ Решительность: "+hogwarts.sStudents[i].getDetermination()+
            "\\ Амбициозность: "+hogwarts.sStudents[i].getAmbition()
                    +"\\ Находчивость: "+hogwarts.sStudents[i].getResourcefulness()
                    +"\\ Жажда власти: "+hogwarts.sStudents[i].getThirstOfAuthority()+
                    "\\ Магия: "+hogwarts.sStudents[i].getMagic() +
                    "\\ Трансгрессия: "+hogwarts.sStudents[i].getTransgression()+")");
        }
        System.out.println("");
    }

    public void printGriffindorStudents() {
        System.out.println("GRIFFINDOR'S STUDENTS: ");
        for (int i = 0; i < hogwarts.gStudents.length; i++) {
            System.out.println(hogwarts.gStudents[i].getName()+" (Благородство: "+hogwarts.gStudents[i].getNobility()+
                    "\\ Честь: "+hogwarts.gStudents[i].getHonor()+"\\ Храбрость: "+hogwarts.gStudents[i].getCourage()+
                    "\\ Магия: "+hogwarts.gStudents[i].getMagic()+"\\ Трансгрессия: "+hogwarts.gStudents[i].getTransgression()+")");
        }
        System.out.println("");
    }
    public void printHufflepuffStudents() {
        System.out.println("HUFFLEPUFF'S STUDENTS: ");
        for (int i = 0; i < hogwarts.hStudents.length; i++) {
            System.out.println(hogwarts.hStudents[i].getName()+ " (Трудолюбие: "+hogwarts.hStudents[i].getIndustriousness()+
                    "\\ Верность: "+hogwarts.hStudents[i].getLoyalty()+"\\ Честность: "+hogwarts.hStudents[i].getHonesty()+
                    "\\ Магия: "+hogwarts.hStudents[i].getMagic()+"\\ Трансгрессия: "+hogwarts.hStudents[i].getTransgression()+")");
        }System.out.println("");
    }
    public void printRavenclawStudents() {
        System.out.println("RAVENCLAW'S STUDENTS: ");
        for (int i = 0; i < hogwarts.rStudents.length; i++) {
            System.out.println(hogwarts.rStudents[i].getName() + " (Ум: "+hogwarts.rStudents[i].getMind()+
                        "\\ Мудрость: "+hogwarts.rStudents[i].getWisdom()+"\\ Остроумие: "+
                        hogwarts.rStudents[i].getWit()+"\\ Творчество: "+hogwarts.rStudents[i].getCreativity()+
                    "\\ Магия: "+hogwarts.rStudents[i].getMagic()+"\\ Трансгрессия: "+hogwarts.rStudents[i].getTransgression()+")");
        }System.out.println("");
    }



}
