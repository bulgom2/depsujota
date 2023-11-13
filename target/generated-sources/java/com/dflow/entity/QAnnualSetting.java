package com.dflow.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QAnnualSetting is a Querydsl query type for AnnualSetting
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAnnualSetting extends EntityPathBase<AnnualSetting> {

    private static final long serialVersionUID = 878724591L;

    public static final QAnnualSetting annualSetting = new QAnnualSetting("annualSetting");

    public final NumberPath<Long> anuSetDefaultCnt = createNumber("anuSetDefaultCnt", Long.class);

    public final NumberPath<Long> anuSetIncrementCnt = createNumber("anuSetIncrementCnt", Long.class);

    public final NumberPath<Long> anuSetIncrementYear = createNumber("anuSetIncrementYear", Long.class);

    public final NumberPath<Long> anuSetMaxCnt = createNumber("anuSetMaxCnt", Long.class);

    public final NumberPath<Long> anuSetNo = createNumber("anuSetNo", Long.class);

    public final StringPath anuSetResetDate = createString("anuSetResetDate");

    public QAnnualSetting(String variable) {
        super(AnnualSetting.class, forVariable(variable));
    }

    public QAnnualSetting(Path<? extends AnnualSetting> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAnnualSetting(PathMetadata metadata) {
        super(AnnualSetting.class, metadata);
    }

}

