package com.bigin.game.common;

public enum Status {

    CODE0000("1000","Default", "Default status"), // HP 가 0이 되면 죽는 상태
    CODE0001("1001", "Disability", "Skill cannot be used"), // MP 가 필요한 마나보다 적거나 0일 때 스킬 사용 불가
    CODE4444("4444","DEAD", "HP is  0 or less"), // HP 가 0이 되면 죽는 상태
    CODE9999("9999", "Ultimate", "Ultimate skill available"); // 레벨이 99가 되면 궁극 스킬을 사용 가능

    private String code;
    private String msg;
    private String description;

    Status(String code, String msg, String description){
        this.code = code;
        this.msg = msg;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Status{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
