package com.quizzes.object;

public class DragonWarriorReferenceChallenger {

    public static void main(String... args) {
        StringBuilder warriorProfession = new StringBuilder("Dragon ");
        String warriorWeapon = "Sord ";
        changeWarriorClass(warriorProfession, warriorWeapon);

        System.out.println("Warrior=" + warriorProfession + "Weapon=" + warriorWeapon);
    }

    static void changeWarriorClass(StringBuilder warriorProfession, String weapon) {
        warriorProfession.append("Knight");
        weapon = "Dragon" + weapon;

        weapon = null;
        warriorProfession = null;
    }
}
