package net.mygit.gitoverview;

public class BaseEntity {
    private Long id;

    public Long getId () {
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    @Override
    public String toString() {
        return "Baseentety{" +
                "id=" + id +
                '}';
    }
    public boolean isNew() {
        return (this.id == null);
    }
}
