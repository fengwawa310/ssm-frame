package cn.com.sky.base;

import java.util.List;

/**
 * @author zhangziqiang
 * <p>
 * 时间: 2018/7/9 10:57
 * 描述：
 */
public interface BaseService<T, V> {
    /**
     * <p>selectByExample</p>
     * <p>动态查询(selectByExample) </p>
     *
     * @param example 对象
     * @return 结果
     */
    List<T> selectAll(V example);

    /**
     * <p>selectByExample</p>
     * <p>按主键查询 (selectByPrimaryKey)</p>
     *
     * @param id 主键
     * @return 结果
     */
    T selectById(String id);

    /**
     * <p>save</p>
     * <p>添加(insertSelective) </p>
     *
     * @param entity T对象
     * @return 结果
     */
    int save(T entity);

    /**
     * <p>update</p>
     * <p>动态修改(updateByExampleSelective)</p>
     *
     * @param entity  T对象
     * @param example V对象
     * @return 结果
     */
    int update(T entity, V example);

    /**
     * <p>updateById</p>
     * <p>按主键修改(updateByPrimaryKeySelective) </p>
     *
     * @param entity T对象
     * @return 解果
     */
    int updateById(T entity);

    /**
     * <p>count</p>
     * <p>动态查询总条数(countByExample)</p>
     *
     * @param example V对象
     * @return 统计结果数
     */
    int count(V example);

    /**
     * <p>deleteByExample</p>
     * <p>动态删除(deleteByExample) </p>
     *
     * @param example V对象
     * @return 结果集
     */
    int delete(V example);

    /**
     * <p>deleteByPrimaryKey</p>
     * <p>按主键删除(deleteByPrimaryKey) </p>
     *
     * @param id 主键id
     * @return 删除结果
     */
    int deleteById(String id);


    /**
     *批量添加
     * @param entity
     */
    void batchSave(List<T> entity);
}
