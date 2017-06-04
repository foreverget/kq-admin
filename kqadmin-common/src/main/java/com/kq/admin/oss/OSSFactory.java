package com.kq.admin.oss;

import com.kq.admin.service.SysConfigService;
import com.kq.admin.utils.ConfigConstant;
import com.kq.admin.utils.Constant;
import com.kq.admin.utils.SpringContextUtils;

/**
 * 文件上传Factory
 */
public final class OSSFactory {
	private static SysConfigService sysConfigService;

	static {
		OSSFactory.sysConfigService = (SysConfigService) SpringContextUtils.getBean("sysConfigService");
	}

	public static CloudStorageService build() {
		// 获取云存储配置信息
		CloudStorageConfig config = sysConfigService.getConfigObject(ConfigConstant.CLOUD_STORAGE_CONFIG_KEY,
				CloudStorageConfig.class);

		if (config.getType() == Constant.CloudService.QINIU.getValue()) {
			return new QiniuCloudStorageService(config);
		} else if (config.getType() == Constant.CloudService.ALIYUN.getValue()) {
			return new AliyunCloudStorageService(config);
		} else if (config.getType() == Constant.CloudService.QCLOUD.getValue()) {
			return new QcloudCloudStorageService(config);
		}

		return null;
	}

}
