package org.stars.lin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.stars.entity.model.vod.Course;
import org.stars.entity.vo.vod.CoursePublishVo;

/**
 * <p>
 * 课程 Mapper 接口
 * </p>
 *
 * @author stars
 * @since 2023-01-24
 */
public interface CourseMapper extends BaseMapper<Course> {

    CoursePublishVo selectCoursePublishVoById(Long id);
}
