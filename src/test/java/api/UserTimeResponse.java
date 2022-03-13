package api;

import java.util.Date;

public class UserTimeResponse extends UserTime {
    public Date updatedAt;

    public UserTimeResponse(String name, String job, Date updatedAt) {
        super(name, job);
        this.updatedAt = updatedAt;
    }

    public UserTimeResponse() {
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }
}
