package com.bigin.game.example.chapter07_08;

public class NewExceptionTest {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException se) {
            System.out.println("에러메시지 : " + se.getMessage());
            se.printStackTrace();
            System.out.println("공간 확보 필요");
        } catch (MemoryException me) {
            System.out.println("에러메시지 : " + me.getMessage());
            me.printStackTrace();
            System.out.println("다시 설치 시도 필요.");
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace())
            throw new SpaceException("설치공간부족");
        if (!enoughMemory())
            throw new MemoryException("메모리부족");
    };

    static void copyFiles() {};

    static void deleteTempFiles() {};

    static boolean enoughSpace() {
        return false;
    };
    static boolean enoughMemory() {
        return true;
    };
}

class SpaceException extends Exception {
    SpaceException(String msg) {
        super(msg);
    }
}

class MemoryException extends Exception {
    MemoryException(String msg) {
        super(msg);
    }
}
