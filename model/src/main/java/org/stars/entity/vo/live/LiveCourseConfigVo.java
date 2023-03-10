package org.stars.entity.vo.live;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.stars.entity.model.live.LiveCourseConfig;
import org.stars.entity.model.live.LiveCourseGoods;

import java.util.List;

@Data
@ApiModel(description = "LiveCourseConfig")
public class LiveCourseConfigVo extends LiveCourseConfig {

	@ApiModelProperty(value = "ๅๅๅ่กจ")
	private List<LiveCourseGoods> liveCourseGoodsList;
}