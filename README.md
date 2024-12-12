### *This is a Draft version*
### Our goal is to achieve the offered grade. The current solution is still under development.
# Deep-Learning-Project

### **Team Name:** 42

### Members:
- **Dávid Frink** (HU7WN7)
- **Gergő László Gyulai** (JJY2VO)
- **Ágoston Horváth** (PGBDTC)

### Description:
Skin cancer can be deadly if not caught early, but many populations lack specialized dermatologic care. Over the past several years, dermoscopy-based AI algorithms have been shown to benefit clinicians in diagnosing melanoma, basal cell, and squamous cell carcinoma. However, determining which individuals should see a clinician in the first place has great potential impact. Triaging applications have a significant potential to benefit underserved populations and improve early skin cancer detection, the key factor in long-term patient outcomes.

Dermatoscope images reveal morphologic features not visible to the naked eye, but these images are typically only captured in dermatology clinics. Algorithms that benefit people in primary care or non-clinical settings must be adept to evaluating lower quality images. This competition leverages 3D TBP to present a novel dataset of every single lesion from thousands of patients across three continents with images resembling cell phone photos.

Our team will develop AI algorithms that differentiate histologically-confirmed malignant skin lesions from benign lesions on a patient. Our work will help to improve early diagnosis and disease prognosis by extending the benefits of automated skin cancer detection to a broader population and settings.

### Files:
#### deep-learning-42_milestone1.ipynb:
- Designation of data source and downloading scripts
- Data exploration and visualization
- Data preparation for training, final result: training, validation and test inputs and outputs

#### deep-learning-42_milestone2.ipynb:
- Designation of data source and downloading scripts
- Data exploration and visualization
- Data preparation for training, final result: training, validation and test inputs and outputs
- Efficient loading of data with a generator
- Defining the model for training
- Training the model
- Evaluation of the prediction

#### Copy_of_deep_learning_42_milestone2.ipynb:
- Same as the deep-learning-42_milestone2.ipynb plus the creation of the tflite model

#### Metadata.ipynb:
- Creates the metadata for an image classifier tflite model

#### SkinCancerIdentifier:
- Android application for the image classifier

#### team42.pptx:
- Report presentation for the project

### Execution method for training and evaluation:
#### deep-learning-42_milestone2.ipynb (You need to copy your own kaggle.json file into Colab in order to validate yourself)

### If you wish to try the Android application:
1. After running deep-learning-42_milestone2.ipynb, download the model.tflite file.
2. Run the Metadata.ipynb with the model.tflite. This adds metadata to your model.
3. After downloading this final model.tflite, replace the one in the SkinCancerIdentifier application with it.
4. Open the SkinCancerIdentifier application using Android Studio and try it using an emulator or a physical device.
