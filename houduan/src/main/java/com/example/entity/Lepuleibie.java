package com.example.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


@TableName("lepuleibie")
@Data
public class Lepuleibie {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
	
	@TableField(value = "leibiemingcheng")
    
	
	
    @TableField(value = "addtime")
    private Date addtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

	public String getLeibiemingcheng() {
        return leibiemingcheng;
    }
    public void setLeibiemingcheng(String leibiemingcheng) {
		this.leibiemingcheng = leibiemingcheng;
    }
        return leibiejieshao;
    }
    public void setLeibiejieshao(String leibiejieshao) {
		this.leibiejieshao = leibiejieshao;
    }
        return shiyongleqi;
    }
    public void setShiyongleqi(String shiyongleqi) {
		this.shiyongleqi = shiyongleqi;
    }
	

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtme(Date addtime) {
        this.addtime = addtime;
    }
}