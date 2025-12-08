package com.prep.ia.prep.ia.DTO;

import com.prep.ia.prep.ia.Enum.LevelEnum;
import com.prep.ia.prep.ia.model.User;

public record JobDTO(String jobName, String description, String area, LevelEnum levelEnum) {
}
