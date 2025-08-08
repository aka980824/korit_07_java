package ch11_access_modifier;

import java.util.Scanner;

/*
    목표 : 객체 지향 설계 및 접근 지정자 이해를 바탕으로
    다양한 접근 수준의 필드와 메서드로 갖는 캐릭터 클래스 정의 및 이를 Main에서 기능 테스트

    설계
    1. 필드
    name 이름 공개가능
    health 체력 일기만
    power 공 같은패키지
    skill 자식클래스만
    exp - 겸치 -> 외부에서 완전차단

    Character클래스의 인스터인스인 warrior 생성
    이름
    체력
    공
    스킬
    exp
    출력

    2. 메서드 정의
    getHealth() -> 체력값을 반환하는 getter /public
    attack() -> 공격시 콘솔창에
    name이 power로 공격!
    name이 경험치 amount를 얻었습니다. -> 2줄로 작성 call1()유형
    heal() -> 체력을 10회복하고. 현재 체력 출력
    체력이 10회복되었습니다. 현재체력 : health(숫자표기)
    getExp(int amount) -> call2()유형이며, 경험치를 증가하는 메서드(내부전용)
    name이(가) 경험치 amount 를 얻었습니다.
 */
class Character{
    public String name;
    private int health;
    int power;
    protected String skill; //자식만
    private int exp; //완전차단

    public void attack(String name, int power){
        System.out.println(name + "가 "+power+"데미지로 공격!");
        this.gainExp(30);
    }
    public void heal(){
        health+=30;
        System.out.println(name+"이(가) 체력이 회복되었습니다.\n현재체력 : "+health);
    }
    private void gainExp(int amount){
        System.out.println(name+"가 경험치 "+amount+" 얻었습니다.");
    }
    //생성자 정의  - 캐릭터 생성시 필수적으로 요구되는 변수만 매개변수로받는 생성자


    public Character(String name, int power, String skill) {
        this.name = name;
        this.power = power;
        this.skill = skill;

        this.health=100; //초기 체력(객체생성시 체력100고정)
        this.exp=0;
    }

    //
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        System.out.println("EXP가 " +exp +"로 변경되었습니다.");
        this.exp = exp;
    }
    public void showInfo(){
        System.out.println("이름 : " + name);
        System.out.println("체력 : " + health);
        System.out.println("공격력 : " + power);
        System.out.println("스킬명 : " + skill);
        System.out.println("Exp : " + exp);
    }
}
public class CharacterMain {
    public static void main(String[] args) {
        Character character = new Character("전사",200,"가로베기");
//        character.setSkill("가로베기");
//        character.setHealth(100);
//        character.setName("warrior전사");
//        character.setPower(200);
//        character.setExp(5);

        character.showInfo();

        character.attack("warrior",100);
        character.heal();
//        character.gainExp(100); -> gainExp()는 private처리하여서 오류발생
    }
}
