package com.dflow.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProjectInfo is a Querydsl query type for ProjectInfo
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProjectInfo extends EntityPathBase<ProjectInfo> {

    private static final long serialVersionUID = 1182929253L;

    public static final QProjectInfo projectInfo = new QProjectInfo("projectInfo");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createDate = _super.createDate;

    //inherited
    public final NumberPath<Long> createNo = _super.createNo;

    public final StringPath projectDescription = createString("projectDescription");

    public final DatePath<java.time.LocalDate> projectEndDate = createDate("projectEndDate", java.time.LocalDate.class);

    public final StringPath projectFeatures = createString("projectFeatures");

    public final BooleanPath projectIsDeleted = createBoolean("projectIsDeleted");

    public final NumberPath<Double> projectManhour = createNumber("projectManhour", Double.class);

    public final StringPath projectName = createString("projectName");

    public final NumberPath<Long> projectNo = createNumber("projectNo", Long.class);

    public final StringPath projectObjective = createString("projectObjective");

    public final StringPath projectOverview = createString("projectOverview");

    public final NumberPath<Integer> projectProgress = createNumber("projectProgress", Integer.class);

    public final StringPath projectRemarks = createString("projectRemarks");

    public final NumberPath<Integer> projectResources = createNumber("projectResources", Integer.class);

    public final DatePath<java.time.LocalDate> projectStartDate = createDate("projectStartDate", java.time.LocalDate.class);

    public final StringPath projectState = createString("projectState");

    public final StringPath projectType = createString("projectType");

    public final ListPath<ProjectResource, QProjectResource> resources = this.<ProjectResource, QProjectResource>createList("resources", ProjectResource.class, QProjectResource.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateDate = _super.updateDate;

    //inherited
    public final NumberPath<Long> updateNo = _super.updateNo;

    public QProjectInfo(String variable) {
        super(ProjectInfo.class, forVariable(variable));
    }

    public QProjectInfo(Path<? extends ProjectInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QProjectInfo(PathMetadata metadata) {
        super(ProjectInfo.class, metadata);
    }

}

