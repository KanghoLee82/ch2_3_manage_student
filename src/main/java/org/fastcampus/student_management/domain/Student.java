package org.fastcampus.student_management.domain;

public class Student {

  private final String name;
  private final int age;
  private final String address;
  private boolean activated;

  public Student(String name, int age, String address) {
    if (name == null || name.isEmpty()) {
      throw new IllegalArgumentException("이름은 필수 입력값입니다.");
    }

    this.name = name;
    this.age = age;
    this.address = address;
    this.activated = true;
  }

  // setter는 객체지향에서 캡슐화를 떨어뜨림
  // 레이어별로 정보를 전달하기 위한 dto 객체를 제외하면 setter 사용은 지양하는게 좋음
  public void activate() {
    if(this.activated) {
      throw new IllegalArgumentException();
    }

    this.activated = true;
  }

  public void deactivate() {
    if(!this.activated) {
      throw new IllegalArgumentException();
    }

    this.activated = false;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getAddress() {
    return address;
  }
  public boolean isActivate() {
    return activated;
  }
}
