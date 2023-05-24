package com.mibanco.novedadesES.dao.contract;

import com.mibanco.novedadesES.dao.entity.NovedadesEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

public interface INovedadesClienteCDTDao extends PanacheRepository<NovedadesEntity> {
}
