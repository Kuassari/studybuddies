package DB_Tables;

class StudentGroupDB{
    private String username; // key
    private long groupId; // key

    public String getUserName(){
        return username;
    }

    public long getGroupId(){
        return groupId;
    }

    public void setUserName(String username){
        this.username = username;
    }

    public void setGroupId(int group_id){
        this.groupId = group_id;
    }




}