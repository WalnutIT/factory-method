/**
 * Copyright 2020 - 2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.walnutit.factorymethod.domain.features;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.walnutit.factorymethod.domain.features.general.BatteryCapacity;
import com.walnutit.factorymethod.domain.features.general.Color;
import com.walnutit.factorymethod.domain.features.general.Engine;
import com.walnutit.factorymethod.domain.features.general.ExtraEquipment;
import com.walnutit.factorymethod.domain.features.general.Rim;

/**
 * @author Daniel Krentzlin
 *
 */
public abstract class ElectroCarFeatures {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(ElectroCarFeatures.class);

	private int configurationId;
	private Engine engine;
	private Color color;
	private BatteryCapacity batteryCapacity;
	private Rim rim;
	private ExtraEquipment extraEquipment;

	public ElectroCarFeatures(Engine engine, Color color,
			BatteryCapacity batteryCapacity, Rim rim,
			ExtraEquipment extraEquipment) {
		super();
		this.engine = engine;
		this.color = color;
		this.batteryCapacity = batteryCapacity;
		this.rim = rim;
		this.extraEquipment = extraEquipment;
		this.configurationId = generateRandomConfigurationId();
	}

	private int generateRandomConfigurationId() {

		try {
			int randomValue = SecureRandom.getInstanceStrong()
					.nextInt();

			if (randomValue < 0) {
				randomValue *= -1;
			}

			return randomValue;
		} catch (NoSuchAlgorithmException e) {
			LOGGER.error("Could not generate Configuration Id");
		}
		return 0;

	}

	public Engine getEngine() {
		return engine;
	}

	public Color getColor() {
		return color;
	}

	public BatteryCapacity getBatteryCapacity() {
		return batteryCapacity;
	}

	public Rim getRim() {
		return rim;
	}

	public ExtraEquipment getExtraEquipment() {
		return extraEquipment;
	}

	public int getConfigurationId() {
		return configurationId;
	}

}
