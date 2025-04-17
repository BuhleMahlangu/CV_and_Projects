namespace grp3PROJECT
{
    partial class loginForm
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.txtID = new System.Windows.Forms.TextBox();
            this.txtContact = new System.Windows.Forms.TextBox();
            this.txtEmail = new System.Windows.Forms.TextBox();
            this.btnLogin = new System.Windows.Forms.Button();
            this.btnCreateDetails = new System.Windows.Forms.Button();
            this.btnUpdate = new System.Windows.Forms.Button();
            this.button1 = new System.Windows.Forms.Button();
            this.btnCustomerLog = new System.Windows.Forms.Button();
            this.button2 = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(66, 29);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(293, 23);
            this.label1.TabIndex = 0;
            this.label1.Text = "Themba\'s Spaza Shop System";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(89, 72);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(238, 13);
            this.label2.TabIndex = 1;
            this.label2.Text = "Enter the following details to confirm your identity:";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(47, 128);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(21, 13);
            this.label3.TabIndex = 2;
            this.label3.Text = "ID:";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(47, 183);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(87, 13);
            this.label4.TabIndex = 3;
            this.label4.Text = "Contact Number:";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(47, 232);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(35, 13);
            this.label5.TabIndex = 4;
            this.label5.Text = "Email:";
            // 
            // txtID
            // 
            this.txtID.Location = new System.Drawing.Point(185, 125);
            this.txtID.Name = "txtID";
            this.txtID.Size = new System.Drawing.Size(190, 20);
            this.txtID.TabIndex = 5;
            // 
            // txtContact
            // 
            this.txtContact.Location = new System.Drawing.Point(185, 180);
            this.txtContact.Name = "txtContact";
            this.txtContact.Size = new System.Drawing.Size(190, 20);
            this.txtContact.TabIndex = 6;
            // 
            // txtEmail
            // 
            this.txtEmail.Location = new System.Drawing.Point(185, 229);
            this.txtEmail.Name = "txtEmail";
            this.txtEmail.Size = new System.Drawing.Size(190, 20);
            this.txtEmail.TabIndex = 7;
            // 
            // btnLogin
            // 
            this.btnLogin.Location = new System.Drawing.Point(50, 287);
            this.btnLogin.Name = "btnLogin";
            this.btnLogin.Size = new System.Drawing.Size(96, 48);
            this.btnLogin.TabIndex = 8;
            this.btnLogin.Text = "Login";
            this.btnLogin.UseVisualStyleBackColor = true;
            this.btnLogin.Click += new System.EventHandler(this.btnLogin_Click);
            // 
            // btnCreateDetails
            // 
            this.btnCreateDetails.Location = new System.Drawing.Point(491, 125);
            this.btnCreateDetails.Name = "btnCreateDetails";
            this.btnCreateDetails.Size = new System.Drawing.Size(96, 48);
            this.btnCreateDetails.TabIndex = 9;
            this.btnCreateDetails.Text = "Create New Deails";
            this.btnCreateDetails.UseVisualStyleBackColor = true;
            this.btnCreateDetails.Click += new System.EventHandler(this.btnCreateDetails_Click);
            // 
            // btnUpdate
            // 
            this.btnUpdate.Location = new System.Drawing.Point(491, 197);
            this.btnUpdate.Name = "btnUpdate";
            this.btnUpdate.Size = new System.Drawing.Size(96, 48);
            this.btnUpdate.TabIndex = 10;
            this.btnUpdate.Text = "Update Details";
            this.btnUpdate.UseVisualStyleBackColor = true;
            this.btnUpdate.Click += new System.EventHandler(this.btnUpdate_Click);
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(292, 287);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(96, 48);
            this.button1.TabIndex = 11;
            this.button1.Text = "Login as supplier";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // btnCustomerLog
            // 
            this.btnCustomerLog.Location = new System.Drawing.Point(170, 287);
            this.btnCustomerLog.Name = "btnCustomerLog";
            this.btnCustomerLog.Size = new System.Drawing.Size(96, 48);
            this.btnCustomerLog.TabIndex = 12;
            this.btnCustomerLog.Text = "Login as customer";
            this.btnCustomerLog.UseVisualStyleBackColor = true;
            this.btnCustomerLog.Click += new System.EventHandler(this.btnCustomerLog_Click);
            // 
            // button2
            // 
            this.button2.Location = new System.Drawing.Point(491, 272);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(96, 42);
            this.button2.TabIndex = 13;
            this.button2.Text = "Delete";
            this.button2.UseVisualStyleBackColor = true;
            // 
            // loginForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(620, 378);
            this.Controls.Add(this.button2);
            this.Controls.Add(this.btnCustomerLog);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.btnUpdate);
            this.Controls.Add(this.btnCreateDetails);
            this.Controls.Add(this.btnLogin);
            this.Controls.Add(this.txtEmail);
            this.Controls.Add(this.txtContact);
            this.Controls.Add(this.txtID);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Name = "loginForm";
            this.Text = "Login";
            this.Load += new System.EventHandler(this.loginForm_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.TextBox txtID;
        private System.Windows.Forms.TextBox txtContact;
        private System.Windows.Forms.TextBox txtEmail;
        private System.Windows.Forms.Button btnLogin;
        private System.Windows.Forms.Button btnCreateDetails;
        private System.Windows.Forms.Button btnUpdate;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Button btnCustomerLog;
        private System.Windows.Forms.Button button2;
    }
}

