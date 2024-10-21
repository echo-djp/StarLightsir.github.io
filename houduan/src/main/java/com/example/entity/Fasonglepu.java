package com.example.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


@TableName("fasonglepu")
@Data
public class Fasonglepu {
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
        return lepuleibie;
    }
    public void setLepuleibie(String lepuleibie) {
		this.lepuleibie = lepuleibie;
    }
        return chuangzuoren;
    }
    public void setChuangzuoren(String chuangzuoren) {
		this.chuangzuoren = chuangzuoren;
    }
        return goumairen;
    }
    public void setGoumairen(String goumairen) {
		this.goumairen = goumairen;
    }
        return lepuchuansong;
    }
    public void setLepuchuansong(String lepuchuansong) {
		this.lepuchuansong = lepuchuansong;
    }
	

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtme(Date addtime) {
        this.addtime = addtime;
    }
}