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
package com.walnutit.factorymethod;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

import com.walnutit.factorymethod.domain.features.ElectroCarFeatures;
import com.walnutit.factorymethod.domain.features.general.BatteryCapacity;
import com.walnutit.factorymethod.domain.features.general.Color;
import com.walnutit.factorymethod.domain.features.general.Engine;
import com.walnutit.factorymethod.domain.features.general.ExtraEquipment;
import com.walnutit.factorymethod.domain.features.general.Rim;
import com.walnutit.factorymethod.domain.features.id3.ElectroCarFeaturesID3Version2;
import com.walnutit.factorymethod.domain.features.id3.ElectroCarFeaturesID3Version1;
import com.walnutit.factorymethod.domain.features.id4.ElectroCarFeaturesID4Version1;
import com.walnutit.factorymethod.factories.ID3Factory;
import com.walnutit.factorymethod.factories.ID4Factory;
import com.walnutit.factorymethod.products.ID3Version1;
import com.walnutit.factorymethod.products.ID3Version2;
import com.walnutit.factorymethod.products.ID4Version1;
import com.walnutit.factorymethod.utils.Timer;

/**
 * @author Daniel Krentzlin
 *
 */
@Controller
public class Client implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		System.out.println("\n\n");
		System.out.println("\n\n");

		ElectroCarFeatures carFeatures = ElectroCarFeaturesID3Version1
				.getEctroCarFeaturesID3(Engine.engine1, Color.blue,
						BatteryCapacity.kWh77, Rim.model2,
						ExtraEquipment.package3);
		FactoryZwickau factoryZwickau = new ID3Factory(
				new ID3Version1(carFeatures));
		System.out.println("\n\n");
		System.out.println(
				"Building VW ID3 Version 1 with configuration id: "
						+ carFeatures.getConfigurationId());
		System.out.println("\n");
		factoryZwickau.buildElectroCar();

		Timer.sleep(5);
		System.out.println("\n\n");
		carFeatures = null;
		factoryZwickau = null;

		carFeatures = ElectroCarFeaturesID3Version2
				.getElectroCarFEaturesID3Version2(Engine.engine1,
						Color.black, BatteryCapacity.kWh58,
						Rim.model3, ExtraEquipment.package1);
		factoryZwickau = new ID3Factory(new ID3Version2(carFeatures));
		System.out.println("\n\n");
		System.out.println(
				"Building VW ID3 Version 2 with configuration id: "
						+ carFeatures.getConfigurationId());
		System.out.println("\n");
		factoryZwickau.buildElectroCar();

		Timer.sleep(5);
		System.out.println("\n\n");
		carFeatures = null;
		factoryZwickau = null;

		carFeatures = ElectroCarFeaturesID4Version1
				.getElectroCarFEaturesID4Version1(Engine.engine1,
						Color.silver, BatteryCapacity.kWh58,
						Rim.model1, ExtraEquipment.package2);
		factoryZwickau = new ID4Factory(new ID4Version1(carFeatures));
		System.out.println("\n\n");
		System.out.println(
				"Building VW ID4 Version 1 with configuration id: "
						+ carFeatures.getConfigurationId());
		System.out.println("\n");
		factoryZwickau.buildElectroCar();

		Timer.sleep(2);
		System.out.println("\n\n");
		System.out.println("Order list has been processed!");

	}

}
