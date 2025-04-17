
namespace grp3PROJECT
{
    partial class UpdateForm
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
            this.txtOwnerID = new System.Windows.Forms.TextBox();
            this.label4 = new System.Windows.Forms.Label();
            this.txtNewContactNum = new System.Windows.Forms.TextBox();
            this.label5 = new System.Windows.Forms.Label();
            this.txtNewEmail = new System.Windows.Forms.TextBox();
            this.btnUpdate = new System.Windows.Forms.Button();
            this.btnReturn = new System.Windows.Forms.Button();
            this.btnCustomerUpdate = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(12, 29);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(466, 23);
            this.label1.TabIndex = 0;
            this.label1.Text = "Update your Contact Number and Email address";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(13, 76);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(478, 16);
            this.label2.TabIndex = 1;
            this.label2.Text = "Confirm your OwnerID then proceed to update your contact number and/or email";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(13, 139);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(55, 13);
            this.label3.TabIndex = 2;
            this.label3.Text = "Owner ID:";
            // 
            // txtOwnerID
            // 
            this.txtOwnerID.Location = new System.Drawing.Point(109, 136);
            this.txtOwnerID.Name = "txtOwnerID";
            this.txtOwnerID.Size = new System.Drawing.Size(173, 20);
            this.txtOwnerID.TabIndex = 3;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(13, 196);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(87, 13);
            this.label4.TabIndex = 4;
            this.label4.Text = "Contact Number:";
            // 
            // txtNewContactNum
            // 
            this.txtNewContactNum.Location = new System.Drawing.Point(109, 193);
            this.txtNewContactNum.Name = "txtNewContactNum";
            this.txtNewContactNum.Size = new System.Drawing.Size(173, 20);
            this.txtNewContactNum.TabIndex = 5;
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(13, 249);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(35, 13);
            this.label5.TabIndex = 6;
            this.label5.Text = "Email:";
            // 
            // txtNewEmail
            // 
            this.txtNewEmail.Location = new System.Drawing.Point(109, 246);
            this.txtNewEmail.Name = "txtNewEmail";
            this.txtNewEmail.Size = new System.Drawing.Size(173, 20);
            this.txtNewEmail.TabIndex = 7;
            // 
            // btnUpdate
            // 
            this.btnUpdate.Location = new System.Drawing.Point(378, 125);
            this.btnUpdate.Name = "btnUpdate";
            this.btnUpdate.Size = new System.Drawing.Size(137, 40);
            this.btnUpdate.TabIndex = 8;
            this.btnUpdate.Text = "Update";
            this.btnUpdate.UseVisualStyleBackColor = true;
            this.btnUpdate.Click += new System.EventHandler(this.btnUpdate_Click);
            // 
            // btnReturn
            // 
            this.btnReturn.Location = new System.Drawing.Point(378, 235);
            this.btnReturn.Name = "btnReturn";
            this.btnReturn.Size = new System.Drawing.Size(137, 40);
            this.btnReturn.TabIndex = 9;
            this.btnReturn.Text = "Return to login page";
            this.btnReturn.UseVisualStyleBackColor = true;
            this.btnReturn.Click += new System.EventHandler(this.btnReturn_Click);
            // 
            // btnCustomerUpdate
            // 
            this.btnCustomerUpdate.Location = new System.Drawing.Point(378, 186);
            this.btnCustomerUpdate.Name = "btnCustomerUpdate";
            this.btnCustomerUpdate.Size = new System.Drawing.Size(137, 43);
            this.btnCustomerUpdate.TabIndex = 10;
            this.btnCustomerUpdate.Text = "Customer Update";
            this.btnCustomerUpdate.UseVisualStyleBackColor = true;
            this.btnCustomerUpdate.Click += new System.EventHandler(this.button1_Click);
            // 
            // UpdateForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(592, 351);
            this.Controls.Add(this.btnCustomerUpdate);
            this.Controls.Add(this.btnReturn);
            this.Controls.Add(this.btnUpdate);
            this.Controls.Add(this.txtNewEmail);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.txtNewContactNum);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.txtOwnerID);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Name = "UpdateForm";
            this.Text = "UpdateForm";
            this.Load += new System.EventHandler(this.UpdateForm_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox txtOwnerID;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox txtNewContactNum;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.TextBox txtNewEmail;
        private System.Windows.Forms.Button btnUpdate;
        private System.Windows.Forms.Button btnReturn;
        private System.Windows.Forms.Button btnCustomerUpdate;
    }
}