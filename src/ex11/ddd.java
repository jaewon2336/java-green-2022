// package ex11;

// // 부모 클래스
// class 동물 {
// String name; // 변수선언 - 동물 이름
// int hp; // 변수선언 - 동물 체력
// int damage; // 변수선언 - 동물 공격력
// int heal; // 변수선언 - 회복량

// String animalName() { // 이름 메소드
// return name;
// }

// int animalHp() { // 체력 메소드
// return hp;
// }

// int animalDamage() { // 공격력 메소드
// return damage;
// }

// int animalAttack(int qwer) { // 공격 메소드(매개변수 - 이름 상관없음)
// return hp;
// }

// int heal() { // 회복량 메소드
// return heal;
// }

// int animalHeal() { // 회복 메소드
// return heal;
// }

// int animalToHeal(int asdf) { // 회복시키기 메소드
// return hp;
// }
// }

// class 사자 extends 동물 {
// String name = "사자";
// int hp = 100;
// int damage = 10;
// int heal = 30;

// String animalName() {
// return name;
// }

// int animalHp() {
// return hp;
// }

// int animalDamage() {
// return damage;
// }

// int animalAttack(int qwer) {
// hp = hp - qwer;
// return hp;
// }

// int heal() {
// hp = hp + heal;
// return hp;
// }

// int animalHeal() {
// return heal;
// }

// int animalToHeal(int asdf) {
// hp = hp + asdf;
// return hp;
// }

// }

// class 호랑이 extends 동물 {
// String name = "호랑이";
// int hp = 100;
// int damage = 15;
// int heal = 10;

// String animalName() {
// return name;
// }

// int animalHp() {
// return hp;
// }

// int animalDamage() {
// return damage;
// }

// int animalAttack(int qwer) {
// hp = hp - qwer;
// return hp;
// }

// int heal() {
// hp = hp + heal;
// return hp;
// }

// int animalHeal() {
// return heal;
// }

// int animalToHeal(int asdf) {
// hp = hp + asdf;
// return hp;
// }
// }

// class 곰 extends 동물 {
// String name = "곰";
// int hp = 100;
// int damage = 50;
// int heal = 2;

// String animalName() {
// return name;
// }

// int animalHp() {
// return hp;
// }

// int animalDamage() {
// return damage;
// }

// int animalAttack(int qwer) {
// hp = hp - qwer;
// return hp;
// }

// int heal() {
// hp = hp + heal;
// return hp;
// }

// int animalHeal() {
// return heal;
// }

// int animalToHeal(int asdf) {
// hp = hp + asdf;
// return hp;
// }
// }

// public class ddd {

// // 오버라이딩 = 무효화 하다 -> 아래로 타고 내려가는 기법
// static void attack(동물 u1, 동물 u2) {

// System.out.println(u2.animalName() + "(이)가 " + u1.animalName() + "에게 공격당하고
// 있습니다.");
// System.out.println(u2.animalName() + "의 hp : " +
// u2.animalAttack(u1.animalDamage()));
// }

// static void selfHeal(동물 u1) {
// System.out.println(u1.animalName() + "(이)가 힐을 사용했습니다.");
// System.out.println(u1.animalName() + "의 hp : " + u1.heal());
// }

// static void heal(동물 u1, 동물 u2) {
// System.out.println(u1.animalName() + "이(가) " + u2.animalName() + "에게 힐을
// 사용했습니다.");
// System.out.println(u2.animalName() + "의 HP : " +
// u2.animalToHeal(u1.animalHeal()));
// }

// public static void main(String[] args) {
// 동물 lion = new 사자();
// 동물 tiger = new 호랑이();
// 동물 bear = new 곰();

// attack(lion, tiger);
// attack(lion, bear);
// attack(tiger, lion);
// attack(tiger, bear);
// attack(bear, lion);
// attack(bear, tiger);
// selfHeal(lion);
// heal(lion, tiger);
// heal(tiger, lion);
// }
// }