package com.dflow.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QRollbookSetting is a Querydsl query type for RollbookSetting
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRollbookSetting extends EntityPathBase<RollbookSetting> {

    private static final long serialVersionUID = -2106772088L;

    public static final QRollbookSetting rollbookSetting = new QRollbookSetting("rollbookSetting");

    public final QBaseTimeEntity _super = new QBaseTimeEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createDate = _super.createDate;

    public final TimePath<java.time.LocalTime> settingCloseTime = createTime("settingCloseTime", java.time.LocalTime.class);

    public final NumberPath<Long> settingNo = createNumber("settingNo", Long.class);

    public final TimePath<java.time.LocalTime> settingOpenTime = createTime("settingOpenTime", java.time.LocalTime.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateDate = _super.updateDate;

    public final NumberPath<Long> updateNo = createNumber("updateNo", Long.class);

    public QRollbookSetting(String variable) {
        super(RollbookSetting.class, forVariable(variable));
    }

    public QRollbookSetting(Path<? extends RollbookSetting> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRollbookSetting(PathMetadata metadata) {
        super(RollbookSetting.class, metadata);
    }

}

