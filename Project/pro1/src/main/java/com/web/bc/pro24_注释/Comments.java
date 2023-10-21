package com.web.bc.pro24_注释;

/**
 * xxxx
 * xxxx
 */
public class Comments {
    public String getStudentInfo(Student student) {
        // 生成明细并返回
        return "id:" + student.getId() + "name:" + student.getName();
    }

    private boolean canRender(String browser, String platform) {
        return browser.toUpperCase().contains("IE") // 浏览器是否是IE
                && platform.toUpperCase().contains("MAC"); // 操作系统是否是MAC
    }

    /**
     * 获取数量
     *
     * @return 数量
     */
    private int getAmnt() {
        return 10;
    }


}
