package ucr.ac.cr.api.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="Person")

public class Person {

    public int personId;
    public String email;
    public String password;
    public String name;
    public String lastName;
    public String interests;
    public byte profilePic;
    public boolean status;
    public int provinceId;
    public int cantonId;
    public int districtId;
    public Date createAt;
    public int createBy;
    public Date updatedBy;
    public int createdBy;

    public Person() {
    }

    public Person(int personId, String email, String password, String name, String lastName, String interests, byte profilePic, boolean status, int provinceId, int cantonId, int districtId, Date createAt, int createBy, Date updatedBy, int createdBy) {
        this.personId = personId;
        this.email = email;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
        this.interests = interests;
        this.profilePic = profilePic;
        this.status = status;
        this.provinceId = provinceId;
        this.cantonId = cantonId;
        this.districtId = districtId;
        this.createAt = createAt;
        this.createBy = createBy;
        this.updatedBy = updatedBy;
        this.createdBy = createdBy;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    public byte getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(byte profilePic) {
        this.profilePic = profilePic;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getCantonId() {
        return cantonId;
    }

    public void setCantonId(int cantonId) {
        this.cantonId = cantonId;
    }

    public int getDistrictId() {
        return districtId;
    }

    public void setDistrictId(int districtId) {
        this.districtId = districtId;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public int getCreateBy() {
        return createBy;
    }

    public void setCreateBy(int createBy) {
        this.createBy = createBy;
    }

    public Date getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Date updatedBy) {
        this.updatedBy = updatedBy;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }
}
