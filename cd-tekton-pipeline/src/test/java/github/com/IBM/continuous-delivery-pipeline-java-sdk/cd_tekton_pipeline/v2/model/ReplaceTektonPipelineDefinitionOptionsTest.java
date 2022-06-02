/*
 * (C) Copyright IBM Corp. 2022.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.DefinitionScmSource;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.ReplaceTektonPipelineDefinitionOptions;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ReplaceTektonPipelineDefinitionOptions model.
 */
public class ReplaceTektonPipelineDefinitionOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testReplaceTektonPipelineDefinitionOptions() throws Throwable {
    DefinitionScmSource definitionScmSourceModel = new DefinitionScmSource.Builder()
      .url("testString")
      .branch("testString")
      .tag("testString")
      .path("testString")
      .build();
    assertEquals(definitionScmSourceModel.url(), "testString");
    assertEquals(definitionScmSourceModel.branch(), "testString");
    assertEquals(definitionScmSourceModel.tag(), "testString");
    assertEquals(definitionScmSourceModel.path(), "testString");

    ReplaceTektonPipelineDefinitionOptions replaceTektonPipelineDefinitionOptionsModel = new ReplaceTektonPipelineDefinitionOptions.Builder()
      .pipelineId("94619026-912b-4d92-8f51-6c74f0692d90")
      .definitionId("94299034-d45f-4e9a-8ed5-6bd5c7bb7ada")
      .scmSource(definitionScmSourceModel)
      .serviceInstanceId("testString")
      .id("testString")
      .build();
    assertEquals(replaceTektonPipelineDefinitionOptionsModel.pipelineId(), "94619026-912b-4d92-8f51-6c74f0692d90");
    assertEquals(replaceTektonPipelineDefinitionOptionsModel.definitionId(), "94299034-d45f-4e9a-8ed5-6bd5c7bb7ada");
    assertEquals(replaceTektonPipelineDefinitionOptionsModel.scmSource(), definitionScmSourceModel);
    assertEquals(replaceTektonPipelineDefinitionOptionsModel.serviceInstanceId(), "testString");
    assertEquals(replaceTektonPipelineDefinitionOptionsModel.id(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceTektonPipelineDefinitionOptionsError() throws Throwable {
    new ReplaceTektonPipelineDefinitionOptions.Builder().build();
  }

}