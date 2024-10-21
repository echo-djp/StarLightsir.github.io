package com.example.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


@TableName("lepuxinxi")
@Data
public class Lepuxinxi {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
	
	@TableField(value = "lepubianhao")
    
	
	
    @TableField(value = "addtime")
    private Date addtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

	public String getLepubianhao() {
        return lepubianhao;
    }
    public void setLepubianhao(String lepubianhao) {
		this.lepubianhao = lepubianhao;
    }
        return lepumingcheng;
    }
    public void setLepumingcheng(String lepumingcheng) {
		this.lepumingcheng = lepumingcheng;
    }
        return lepufenlei;
    }
    public void setLepufenlei(String lepufenlei) {
		this.lepufenlei = lepufenlei;
    }
        return leqi;
    }
    public void setLeqi(String leqi) {
		this.leqi = leqi;
    }
        return lepujieshao;
    }
    public void setLepujieshao(String lepujieshao) {
		this.lepujieshao = lepujieshao;
    }
        return jiage;
    }
    public void setJiage(String jiage) {
		this.jiage = jiage;
    }
        return leputu;
    }
    public void setLeputu(String leputu) {
		this.leputu = leputu;
    }
        return chuangzuoren;
    }
    public void setChuangzuoren(String chuangzuoren) {
		this.chuangzuoren = chuangzuoren;
    }
	

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtme(Date addtime) {
        this.addtime = addtime;
    }
}