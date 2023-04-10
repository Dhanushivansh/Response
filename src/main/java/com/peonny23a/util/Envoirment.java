package com.peonny23a.util;

import java.io.IOException;

import io.opentelemetry.context.propagation.TextMapPropagator;

public class Envoirment {
	String filepath = "src/main/resoures/Envoirment.Properties";
	private String baseDir;

	public String getAppUrl() throws IOException {
		PropUtil prop = new PropUtil();
		String baseDirString = System.getProperty("user.dir");
		return prop.getvalue(baseDir + filepath, "app_url");

	}
}
