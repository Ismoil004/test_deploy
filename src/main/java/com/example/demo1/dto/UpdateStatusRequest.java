package com.example.demo1.dto;

public class UpdateStatusRequest {
    private boolean status;
    private boolean adminstatus;

    public boolean isAdminstatus() {
        return adminstatus;
    }


    public boolean isStatus() {
        return status;
    }


    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setAdminstatus(boolean adminstatus) {
        this.adminstatus = adminstatus;
    }
}
